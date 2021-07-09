#include <iostream>
#include <string>
using namespace std;


class LinkedQueue
{
	private:
	class ListNode
		{
			public:
				int data;
				ListNode *next;
				ListNode(int d)
				{
					data = d;
					next = NULL;
				}
		};
	protected:
		ListNode *front;
		ListNode *rear;
		int Size;

	public:
		LinkedQueue()
		{
			this->front = NULL;
			this->rear = NULL;
			this->Size = 0;
		}

		~LinkedQueue()
		{
			ListNode * temp = front;
			ListNode * pre = NULL;
			
			//Traverse whole List and delete one by One
			while(temp->next != NULL){
				pre = temp;
				temp = temp->next; 
				delete pre;
				}
			delete temp;
			delete front;
		}

	void enQueue(const int & e)
		{
			ListNode *tmp = new ListNode(e);
			
			//if Null, both will point to same node
			if(this->rear == NULL){
				this->rear = tmp;
				this->front = tmp;
			}
			
			//if not null than
			this->rear->next = tmp;
			this->rear = tmp;
			delete tmp;
			this->Size++;
		}

		int deQueue	()
		{
			if(this->isEmpty())
			{
				throw string("ArrayQueue is empty!!");
			}
			
			ListNode *tmp = front;
			this->front = front->next;
			
			//If node ends and front will become Null than rear should also be equal to NULL
			if (front == NULL)
           		rear = NULL;
			this->Size--;
			int data = tmp->data;
			delete tmp;
			return data;
		}

		bool  isEmpty() const
		{
			return (this->front == NULL && this->rear == NULL);
		}

		int  size() const
		{
			return this->Size;
		}
};

int main()
{
	LinkedQueue *s = new LinkedQueue();
	
	s->enQueue(12);
	s->enQueue(33);
	s->enQueue(28);
	s->enQueue(89);
	s->enQueue(44);
	cout << s->deQueue	() << endl;
	s->enQueue(57);
	cout << s->deQueue	() << endl;
	cout << s->deQueue	() << endl;
	s->enQueue(94);
	cout << s->deQueue	() << endl;
	cout << s->deQueue	() << endl;
	cout << s->deQueue	() << endl;
	cout << (s->isEmpty() ? "Empty Stack" : "Non empty Queue") << endl;
	try
	{
		cout << s->deQueue	() << endl;
	}
	catch(string s)
	{
		cout << "Exception caught: " << s << endl;
	}
	
	
	return 0;
}
