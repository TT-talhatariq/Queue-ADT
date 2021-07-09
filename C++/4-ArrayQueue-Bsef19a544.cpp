#include <iostream>
#include <string>

using namespace std;

class ArrayQueue
{
	protected:
		int *data;
		int arraySize;
		int front;
		int rear ;

		void create(int sz)
		{
			this->data = new int[sz];
			this->arraySize = sz;
			this->front = 0;
			this->rear = 0;
		}

		void increaseSize()
		{
			// Increase size 100 more
			int *tmp = new int[arraySize+100];
			for(int i=0; i<arraySize; i++){
				tmp[i] = this->data[i];	
			}
			delete [] this->data;
			this->data = tmp;
			this->arraySize+=100; 
		}
	public:
		ArrayQueue()
		{
			this->create(10); // 10 is default size and can be changed
		}

		ArrayQueue(int sz)
		{
			this->create(sz);
		}

		~ArrayQueue()
		{
			delete [] this->data;
			this->data = NULL;
		}

		void enQueue(const int & e)
		{
			if(this->isFull())
			{
				this->increaseSize();
			}
			if(this->isFull())
			{
				throw string("ArrayQueue is full!!");
			}

			this->data[this->rear] = e;
			this->rear++;
		}

		int deQueue	()
		{
			int ro = this->data[front];
			this->front++;
			return ro;
		}

		bool isEmpty() const
		{
			return (this->front == rear);
		}

		bool isFull() const
		{
			return (this->rear == this->arraySize);
		}

		long size() const
		{
			return this->rear;
		}
};

int main()
{
	ArrayQueue *s = new ArrayQueue();
	
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
	//cout << s->deQueue	() << endl;
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
	
	delete s;
	
	return 0;
}
