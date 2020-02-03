
package uva_459;

import java.util.Scanner;

class disjoinset
{
    int []rank,parent;
    int n;

    disjoinset(int n)
    {
        parent=new int[n];
        rank=new int[n];
        this.n=n;
        makeset();
     }

    void makeset()
    {
        for(int i=0; i<n; i++)
        {
            parent[i]=i;
        }
    }

     int find(int x)
    {

        if (parent[x]==x)
        {

            return x;

        }
        else
        {
            parent[x]=find(parent[x]);
            return parent[x];
        }
    }

    void Union(int a,int b)
    {
        int xroot=find(a);
        int yroot=find(b);

        if(xroot==yroot)
        {
            return;
        }

        if(rank[xroot] < rank[yroot])
        {
            parent[xroot]=yroot;
        }

        else if(rank[yroot] < rank[xroot])
        {
            parent[yroot]=xroot;
        }

        else
        {
            parent[yroot]=xroot;
            rank[xroot]=rank[xroot]+1;

        }
    }
}

public class Uva_459 
{

    public static void main(String[] args)
    {
        String s1,s2;
      int x,y,n,t;
    Scanner in=new Scanner(System.in);
    t=in.nextInt();
    while(t--)
    {
        gets(s1);
        n=s1[0]-'A'+1;
        ans=n;
        disjoinset ds=new disjoinset(n);

        while(1)
        {
            gets(s2);
            if(s2.empty())
            {
                break;
            }
            int x=s2[0]-'A';
            int y=s2[1]-'A';

            if(ds.find(x)!=ds.find(y))
            {
                ds.Union(x,y);
                ans--;
            }
        }
      }
    }
    
}
