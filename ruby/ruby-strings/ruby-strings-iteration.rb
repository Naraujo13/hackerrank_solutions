# Your code here

def count_multibyte_char(string)  
  string.each_char.select {|c| c.bytesize > 1}.length
end
