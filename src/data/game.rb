# Ruby Adventure Game

class Player
  attr_accessor :name, :health

  def initialize(name)
    @name = name
    @health = 100
  end

  def take_damage(damage)
    @health -= damage
    puts "#{@name} took #{damage} damage!"
    puts "#{@name}'s health: #{@health}"
  end

  def heal(amount)
    @health += amount
    puts "#{@name} healed for #{amount} points!"
    puts "#{@name}'s health: #{@health}"
  end

  def attack(enemy)
    damage = rand(10..20)
    puts "#{@name} attacked #{enemy.name} and dealt #{damage} damage!"
    enemy.take_damage(damage)
  end
end

class Enemy
  attr_accessor :name, :health

  def initialize(name)
    @name = name
    @health = 50
  end

  def take_damage(damage)
    @health -= damage
    puts "#{@name} took #{damage} damage!"
    puts "#{@name}'s health: #{@health}"
  end
end

def start_game
  puts "Welcome to the Ruby Adventure Game!"
  print "Enter your name: "
  player_name = gets.chomp
  player = Player.new(player_name)
  enemy = Enemy.new("Evil Monster")

  puts "\nHello, #{player.name}! Your adventure begins!"

  loop do
    puts "\n--- Options ---"
    puts "1. Attack"
    puts "2. Heal"
    puts "3. Quit"
    print "Choose an option: "
    option = gets.chomp.to_i

    case option
    when 1
      player.attack(enemy)
      break if enemy.health <= 0
    when 2
      player.heal(rand(10..20))
    when 3
      puts "Exiting the game..."
      break
    else
      puts "Invalid option! Try again."
    end
  end

  puts "Game Over!"
end

start_game
