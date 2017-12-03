package graph;

public class Knoten {
	private Knoten[] _neigh;
	private int[] _gewicht;
	private Object _data;
	private int _size;
	
	public Knoten(Object data)
	{
		_data = data;
		_neigh = new Knoten[5];
		_gewicht = new int[5];
	}

	public void addKnoten(Knoten knoten, int gewicht)
	{
		if(_size <= 5)
		{
			_neigh[_size] = knoten;
			_gewicht[_size++] = gewicht;
		}
	}
	
	public Object getData()
	{
		return _data;
	}
	
	public Knoten[] getNeigh()
	{
		return _neigh;
	}
}
