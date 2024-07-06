# Question 1:

variance <- 4
sd <- sqrt(4)
n <- 25
alpha <- 0.05
q_score = qnorm(p=alpha/2, lower.tail=F)
x = 6.2

lower_limit = x - (sd*q_score)/sqrt(n)
upper_limit = x + (sd*q_score)/sqrt(n)

print(c(lower_limit, upper_limit))

# Question 2:

contents <- c(9.8, 10.2, 10.4, 9.8, 10.0, 10.2, 9.6)
x = mean(contents)
sd = sd(contents)
n <- 7
df = n - 1
t_score = qt(p=0.05/2, df=df, lower.tail = F)

lower_limit = x - (sd*t_score)/sqrt(n)
upper_limit = x + (sd*t_score)/sqrt(n)

print(c(lower_limit, upper_limit))

# Question 3:
