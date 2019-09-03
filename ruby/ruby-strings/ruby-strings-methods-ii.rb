# Enter your code here
def mask_article(string, words)
  pattern = words.join('|')
  string.gsub!(pattern) {|match| strike(match) }
end

def strike(string)
  "<strike>#{string}</strike>"
end

puts mask_article("Hello World! This is crap!", ["crap"])
