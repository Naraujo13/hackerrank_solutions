def scoring(array)
  # update_score of every user in the array unless the user is admin
  array.each { |u| u.update_score unless u.is_admin? }
end
