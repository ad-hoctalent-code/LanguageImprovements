package com;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeeingCollectors {
	public static void main(String[] args) {
		SalaryRange salaryRange = Stream.of(56700, 67600, 45200, 120000, 77600, 85000)
				.collect(
							Collectors.teeing(
									Collectors.minBy(Integer::compareTo), 
									Collectors.maxBy(Integer::compareTo), 
									SalaryRange::fromOptional));
		
		
		System.out.println(salaryRange);
						
		
	}
	
	private static class SalaryRange {
		private final Integer min;
		private final Integer max;

		private SalaryRange(Integer min, Integer max) {
			this.min = min;
			this.max = max;
		}

		public static SalaryRange fromOptional(Optional<Integer> min, Optional<Integer> max) {
			if (min.isEmpty() || max.isEmpty()) {
				throw new IllegalStateException("Minimum and " + "maximum salaries cannot be null");
			}
			return new SalaryRange(min.get(), max.get());
		}

		@Override
		public String toString() {
			return "Salaries range between " + min + " and " + max + ".";
		}
	}
	
}


