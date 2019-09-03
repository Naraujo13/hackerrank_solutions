def sum_terms(n)
  # your code here
  (1..n).map { |e| e**2 + 1 }.reduce(0, :+)
end
