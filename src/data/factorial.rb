def factorial(n)
  if n <= 1
    1
  else
    n * factorial(n - 1)
  end
end

=begin
Everything between a line beginning with `=begin' down to
one beginning with `=end' will be skipped by the interpreter.
These reserved words must begin in column 1.
=end

number = 5
result = factorial(number)
puts "The factorial of #{number} is #{result}."
