package graph;

public abstract class Graph {
	
	protected Object[] _arr;
	private int _size;

	public Graph()
	{
		_arr = new Object[10];
		_size = 0;
	}
	
	/**
	 * Fügt ein Object dem Graphen hinzu
	 * @param obj Das Object, welches hinzugefügt werden soll.
	 */
	public Pos insert(Object obj)
	{
		int length = _arr.length;
		if(length == _size)
		{
			Object[] arr = new Object[length*2];
			for(int i = 0; i< length; i++)
			{
				arr[i] = _arr[i];
			}
			_arr = arr;
		}
		_arr[_size++] = obj;
		return getPos(_size-1);
	}
	
	protected abstract Pos getPos(int index);
	
	/**
	 * Gibt alle Nachbarn einer Positon auf der Konsole aus
	 * @param pos
	 */
	public abstract void allNeigh(Pos pos);
	
	/**
	 * Erstellt eine Kante zwischen zwei Daten. Maximaler Grad ist 5
	 * @param pos1 Die erste Position
	 * @param pos2 Die zweite Position
	 * @param gewicht Das Gewicht der Kante
	 * @param gerichtet wenn true, nur von pos1 zu pos2 ein übergang. wenn false von beiden
	 */
	public abstract void setNeigh(Pos pos1, Pos pos2, int gewicht, boolean gerichtet);
	
	/**
	 * Erzeugt einen Random Graphen
	 */
	public void generateRndGraph()
	{
		
	}
}
