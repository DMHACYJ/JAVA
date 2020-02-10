#include<iostream>
#include<string>
#include<vector>
#define MAXN 1000//�ڴ����ռ�
using namespace std;
struct Memory{
	int begin;//һ�������Ŀ�ʼ��ַ
	int end;//һ�������Ľ�����ַ
	string name;//����������
};
vector<Memory>v;
//��ʼ�������ռ�
void Init(){
	Memory m;
	m.begin = 0;
    m.end = MAXN;
	m.name = "������";
	v.insert(v.begin()+0,m);
}
void ApplySpace(string na,int num){
	int i = 0;
	while (i<v.size()){
		int k = v[i].end - v[i].begin;
		if (v[i].name == "������" && k >= num){
			Memory m;
			m.begin = v[i].begin;
			m.end = v[i].begin + num;
			m.name = na;
			Memory m1;
			int flag = 0;
			if (v[i].end != m.end){
				m1.begin = m.end;
				m1.end = v[i].end;
				m1.name = "������";
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
			//ǰ���������ǿ�����
			if (i-1>=0&&v[i - 1].name == "������"&&v[i + 1].name == "������"){
				Memory m;
				m.begin = v[i - 1].begin;
				m.end = v[i + 1].end;
				m.name = "������";
				v.erase(v.begin() + i-1);
				v.erase(v.begin() + i-1);
				v.erase(v.begin() + i - 1);
				v.insert(v.begin() + i - 1, m);
			}
			else{
				//ֻ�к����ǿ�����
				if (v[i + 1].name == "������"){
					Memory m;
					m.begin = v[i].begin;
					m.end = v[i + 1].end;
					m.name = "������";
					v.erase(v.begin() + i);
					v.erase(v.begin() + i);
					v.insert(v.begin() + i, m);
				}else{
					//ֻ��ǰ���ǿ�����
					if (i-1>=0&&v[i - 1].name == "������"){
						Memory m;
						m.begin = v[i-1].begin;
						m.end = v[i].end;
						m.name = "������";
						v.erase(v.begin() + i - 1);
						v.erase(v.begin() + i - 1);
						v.insert(v.begin() + i - 1, m);
					}
					else{
						//ǰ��û�п�����
						Memory m;
						m.begin = v[i].begin;
						m.end = v[i].end;
						m.name = "������";
						v.erase(v.begin() + i);
						v.insert(v.begin() + i, m);
					}
				}
			}
		}
	}
}

void print(){
	cout << "�ڴ�����\t�ڴ濪ʼ��ַ\t�ڴ������ַ\t�ڴ��С" << endl;
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
		cout << "��������Ҫ�Կռ���еĲ���(0-�˳�������1-����ռ䣬2-�ͷſռ�):";
		cin >> n;
		string na;
		int num;
		if (n == 1){
			cout << "��������ҵ���ֺ�Ҫ����Ŀռ��С:";
			cin >> na >> num;
			ApplySpace(na, num);
		}
		if (n == 2){
			cout << "��������ҵ����:";
			cin >> na;
			FreeSpace(na);
		}
	} while (n != 0);
	system("pause");
	return 0;
}
