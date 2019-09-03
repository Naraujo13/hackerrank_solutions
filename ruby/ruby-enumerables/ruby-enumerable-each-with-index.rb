def skip_animals(animals, skip)
  # Your code here
  animals.each_with_index.map { |a, i| (i.to_s + ':' + a) }[skip..-1]
end
