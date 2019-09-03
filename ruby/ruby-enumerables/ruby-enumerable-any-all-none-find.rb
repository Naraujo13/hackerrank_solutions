def func_any(hash)
    # Check and return true if any key object within the hash is of the type Integer
    # If not found, return false.
  hash.any? {|k,v| k.is_a? Integer}
end

def func_all(hash)
    # Check and return true if all the values within the hash are Integers and are < 10
    # If not all values satisfy this, return false.
  hash.values.all? { |v| v.is_a? Integer and v < 10  }
end

def func_none(hash)
    # Check and return true if none of the values within the hash are nil
    # If any value contains nil, return false.
  hash.values.none?(&:nil?)
end

def func_find(hash)
    # Check and return the first object that satisfies either of the following properties:
    #   1. There is a [key, value] pair where the key and value are both Integers and the value is < 20 
    #   2. There is a [key, value] pair where the key and value are both Strings and the value starts with `a`.
  hash.find do |k,v| 
    (k.is_a? Integer and v.is_a? Integer and v < 20) or
    (k.is_a? String and v.is_a? String and v[0] == 'a')
  end
end
