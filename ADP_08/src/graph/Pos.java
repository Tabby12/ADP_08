package graph;

public class Pos {
	private int _index;
	private Knoten _knoten;
	private boolean _valid;
	
	public void setIndex(int index)
	{
		_index = index;
	}
	
	public int getIndex()
	{
		return _index;
	}

	public void setKnoten(Knoten knoten)
	{
		_knoten = knoten;
	}
	
	public Knoten getKnoten()
	{
		return _knoten;
	}
	
	public void setValid(boolean valid)
	{
		_valid = valid;
	}
	
	public boolean isValid()
	{
		return _valid;
	}
}
