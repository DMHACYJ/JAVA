#include<iostream>
#include<string>
#include<vector>
#define MAXN 1000//内存最大空间
using namespace std;
struct Memory{
	int begin;//一个分区的开始地址
	int end;//一个分区的结束地址
	string name;//分区的名字
};
vector<Memory>v;
//初始化工作空间
void Init(){
	Memory m;
	m.begin = 0;
    m.end = MAXN;
	m.name = "空闲区";
	v.insert(v.begin()+0,m);
}
void ApplySpace(string na,int num){
	int i = 0;
	while (i<v.size()){
		int k = v[i].end - v[i].begin;
		if (v[i].name == "空闲区" && k >= num){
			Memory m;
			m.begin = v[i].begin;
			m.end = v[i].begin + num;
			m.name = na;
			Memory m1;
			int flag = 0;
			if (v[i].end != m.end){
				m1.begin = m.end;
				m1.end = v[i].end;
				m1.name = "空闲区";
				flag = 1;
			}
				v.erase(v.begin() + i);
				v.insert(v.begin()+i, m);
				if (flag == 1)
					v.insert(v.begin() +i+ 1, m1);
			break;
		}
		i++;
	}
}
void FreeSpace(string na){
	for (int i = 0; i < v.size(); i++){
		if (v[i].name == na){
			//前后两个都是空闲区
			if (i-1>=0&&v[i - 1].name == "空闲区"&&v[i + 1].name == "空闲区"){
				Memory m;
				m.begin = v[i - 1].begin;
				m.end = v[i + 1].end;
				m.name = "空闲区";
				v.erase(v.begin() + i-1);
				v.erase(v.begin() + i-1);
				v.erase(v.begin() + i - 1);
				v.insert(v.begin() + i - 1, m);
			}
			else{
				//只有后面是空闲区
				if (v[i + 1].name == "空闲区"){
					Memory m;
					m.begin = v[i].begin;
					m.end = v[i + 1].end;
					m.name = "空闲区";
					v.erase(v.begin() + i);
					v.erase(v.begin() + i);
					v.insert(v.begin() + i, m);
				}else{
					//只有前面是空闲区
					if (i-1>=0&&v[i - 1].name == "空闲区"){
						Memory m;
						m.begin = v[i-1].begin;
						m.end = v[i].end;
						m.name = "空闲区";
						v.erase(v.begin() + i - 1);
						v.erase(v.begin() + i - 1);
						v.insert(v.begin() + i - 1, m);
					}
					else{
						//前后都没有空闲区
						Memory m;
						m.begin = v[i].begin;
						m.end = v[i].end;
						m.name = "空闲区";
						v.erase(v.begin() + i);
						v.insert(v.begin() + i, m);
					}
				}
			}
		}
	}
}

void print(){
	cout << "内存名字\t内存开始地址\t内存结束地址\t内存大小" << endl;
	for (int i = 0; i < v.size(); i++){
		int k = v[i].end-v[i].begin;
		cout << v[i].name << "          \t" << v[i].begin << "         \t" << v[i].end << "        \t" << k << endl;
	}
}
int main(){
	int n;
	Init();
	do{
		print();
		cout << "请输入你要对空间进行的操作(0-退出操作，1-申请空间，2-释放空间):";
		cin >> n;
		string na;
		int num;
		if (n == 1){
			cout << "请输入作业名字和要申请的空间大小:";
			cin >> na >> num;
			ApplySpace(na, num);
		}
		if (n == 2){
			cout << "请输入作业名字:";
			cin >> na;
			FreeSpace(na);
		}
	} while (n != 0);
	system("pause");
	return 0;
}
