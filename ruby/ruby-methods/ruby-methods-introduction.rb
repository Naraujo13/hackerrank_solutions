# Your code here
def prime?(number)  
  return false if [0, 1].include?(number)
  (2..number/2).none? { |i| number % i == 0}
end
