#matrix
m1<- matrix(1:6,nrow=2,ncol=3,byrow=TRUE)

m1
m2<- matrix(1:6,nr=2,nc=3,byrow=F)
m2
rownames(m1) <- c("row1","row2")
colnames(m2) <- c("col1","col2","col3")
diag(m1)
#转置矩阵     
t(m1)
m1
#矩阵的逐元乘积
m1%*%t(m1)

#方阵的行列式
m2<- matrix(1:4,2)
det(m2)

#数据框的直接建立
x <- c(42,7,64,9)
y <- 1:4
z.df <- data.frame(index=y,value=x)
z.df
rownames(z.df)<- c("row1","row2","row3","row4")
colnames(z.df)<- c("col1","col2")
z.df[1,2] <- "apple"
z.df$col3<- z.df$col1 +3
row5<- c(1,2,3)

rbind(z.df,row5)
dim(z.df)
row.names(z.df[5,]) <- "row5"
rownames(z.df[5,]) <- "row5_1"





# > #matrix
# > m1<- matrix(1:6,nrow=2,ncol=3,byrow=TRUE)
# > 
# > m1
#      [,1] [,2] [,3]
# [1,]    1    2    3
# [2,]    4    5    6
# > m2<- matrix(1:6,nr=2,nc=3,byrow=F)
# > m2
#      [,1] [,2] [,3]
# [1,]    1    3    5
# [2,]    2    4    6
# > rownames(m1) <- c("row1","row2")
# > colnames(m2) <- c("col1","col2","col3")
# > diag(m1)
# [1] 1 5
# > #matrix
# > m1<- matrix(1:6,nrow=2,ncol=3,byrow=TRUE)
# > 
# > m1
#      [,1] [,2] [,3]
# [1,]    1    2    3
# [2,]    4    5    6
# > m2<- matrix(1:6,nr=2,nc=3,byrow=F)
# > m2
#      [,1] [,2] [,3]
# [1,]    1    3    5
# [2,]    2    4    6
# > rownames(m1) <- c("row1","row2")
# > colnames(m2) <- c("col1","col2","col3")
# > diag(m1)
# [1] 1 5
# > #转置矩阵     
# > t(m1)
#      row1 row2
# [1,]    1    4
# [2,]    2    5
# [3,]    3    6
# > m1
#      [,1] [,2] [,3]
# row1    1    2    3
# row2    4    5    6
# > #矩阵的逐元乘积
# > m1%*%t(m1)
#      row1 row2
# row1   14   32
# row2   32   77
# > 
# > #方阵的行列式
# > m2<- matrix(1:4,2)
# > det(m2)
# [1] -2
# > 
# > #数据框的直接建立
# > x <- c(42,7,64,9)
# > y <- 1:4
# > z.df <- data.frame(index=y,value=x)
# > z.df
#   index value
# 1     1    42
# 2     2     7
# 3     3    64
# 4     4     9
# > rownames(z.df)<- c("row1","row2","row3","row4")
# > colnames(z.df)<- c("col1","col2")
# > z.df[1,2] <- "apple"
# > z.df$col3<- z.df$col1 +3
# > row5<- c(1,2,3)
# > 
# > rbind(z.df,row5)
#      col1  col2 col3
# row1    1 apple    4
# row2    2     7    5
# row3    3    64    6
# row4    4     9    7
# 5       1     2    3
# > dim(z.df)
# [1] 4 3
# > row.names(z.df[5,]) <- "row5"
# > rownames(z.df[5,]) <- "row5_1"
