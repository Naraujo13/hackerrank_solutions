def group_by_marks(marks, pass_marks)
  # your code here
  marks.group_by do |k, v|
    if v < pass_marks
      'Failed'
    else
      'Passed'
    end
  end
end
