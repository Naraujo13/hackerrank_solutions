# Enter your code here.

hackerrank.store(543121, 100)
hackerrank.keep_if { |k, _| k.is_a?(Integer) }
hackerrank.delete_if { |k, _| k.even? }
