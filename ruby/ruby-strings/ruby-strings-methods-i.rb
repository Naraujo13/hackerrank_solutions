def process_text(arr)
  arr.map(&:chomp).map(&:strip).join(' ')
end
