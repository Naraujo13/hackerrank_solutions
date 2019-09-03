# Enter your code here. Read input from STDIN. Print output to STDOUT
require 'prime'

prime_palindromes = ->(n) do
  Prime.each.lazy.select do |x| 
    x.to_s == x.to_s.reverse
  end.first(n)
end

n = gets.to_i
p prime_palindromes.call(n)



