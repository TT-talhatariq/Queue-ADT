#include<iostream>
#include<queue>
#include<string>
using namespace std;
int main(){
	priority_queue<string>p;
	p.push("AA");
	p.push("Ab");
	p.push("Za");
	 while (!p.empty()) {
        cout << ' ' << p.top();
        p.pop();
    }
	return 0;
}
