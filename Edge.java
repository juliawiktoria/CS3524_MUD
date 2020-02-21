/***********************************************************************
 * cs3524.solutions.mud.Edge'
 * CS3524 DISTRIBUTED SYSTEMS AND SECURITY - ASSIGNMENT 2 MUD GAME
 * JULIA WIKTORIA ZIEBA (ID: 51768280)
 ***********************************************************************/

package cs3524.solutions.mud;

// Represents an path in the MUD (an edge in a graph).
class Edge
{
    public Vertex _dest;   // Your destination if you walk down this path
    public String _view;   // What you see if you look down this path
    
    public Edge( Vertex d, String v )
    {
        _dest = d;
	_view = v;
    }
}

