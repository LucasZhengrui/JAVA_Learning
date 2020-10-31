struct state
{
	string StateName;
};

//NFA的边，空转换符用'#'表示
struct edge
{
	state StartState;  
	state EndState;
	char TransSymbol;  //转换符号
};

//NFA单元，一个大的NFA单元可以是由很多小单元通过规则拼接起来
struct cell
{
	edge EdgeSet[MAX];  //这个NFA拥有的边
	int EdgeCount;  //边数
	state StartState;  //开始状态
	state EndState;  //结束状态
};
