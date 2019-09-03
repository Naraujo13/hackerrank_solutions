# Your code here
def full_name(first_name, *middle_names, last_name)
  name = middle_names.reduce(first_name) { |b, s| b + ' ' + s }
  "#{name} #{last_name}"
end
