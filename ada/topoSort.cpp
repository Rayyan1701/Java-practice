#include <iostream>
#include <vector>
#include <queue>
using namespace std;

void topologicalSort(int, int**);

int main()
{
    int n, v;
 
    cout << "\n\tEnter number of vertices: ";
    cin >> n;

    int **cost = new int *[n+1];
    for (int i = 1; i <= n; i++)
    {
        cost[i] = new int[n+1];
    }

    cout << "\n\tEnter the Adjacency matrix for the graph: " << endl;
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= n; j++)
        {
            cout << "\t\tVertex " << i << " to " << j << " : ";
            cin >> cost[i][j];
        }
    }

    cout << "\n\t The Adjacency matrix looks like this-" << endl;
    for(int i = 1; i <= n; i++) 
    {
        cout << "\t\t [";
        for(int j = 1; j < n; j++)
        {
            cout << cost[i][j] << ",";
        }
        cout << cost[i][n] << "]" << endl;
    }

    topologicalSort(n, cost);

    cout << "\n" << endl;
    return 0;
}

void topologicalSort(int n, int **adj)
{
    vector<int> T;

    queue<int> Q;
    int visited[n+1], inDegree[n+1], vertex;

    for(int i = 1; i < n+1; i++)
        visited[i] = inDegree[i] = 0;

    for(int i = 1; i < n+1; i++)
    {
        for(int j = 1; j < n+1; j++)
        {
            if(adj[i][j] == 1)
                inDegree[j] += 1; 
        }
    }

    for(int i = 0; i < n+1; i++)
    {
        if(inDegree[i] == 0)
        {
            Q.push(i);
            visited[i] = 1;
        }
    }

    while(!Q.empty())
    {
        vertex = Q.front();
        Q.pop();

        T.push_back(vertex);

        for(int i = 0; i < n+1; i++)
        {
            if((adj[vertex][i] == 1) && (visited[i] != 1))
            {
                inDegree[i] -= 1;

                if(inDegree[i] == 0)
                {
                    Q.push(i);
                    visited[i] = 1;
                }
            }
        }
    }

    cout << "\n\t The topological sequence is : \n\t\t";
    for(auto it : T)
        cout << it << " ";
}