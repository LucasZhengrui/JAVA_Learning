#matrix
m1<- matrix(1:6,nrow=2,ncol=3,byrow=TRUE)

m1
m2<- matrix(1:6,nr=2,nc=3,byrow=F)
m2
rownames(m1) <- c("row1","row2")
colnames(m2) <- c("col1","col2","col3")
diag(m1)



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
