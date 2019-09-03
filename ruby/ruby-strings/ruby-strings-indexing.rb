# Your code here

def serial_average(input)
  sss = input[0, 3]
  xx = input[4, 5].to_f
  yy = input[-5, 5].to_f
  
  "#{sss}-%.2f" % ((xx+yy)/2.0).round(2)
end
