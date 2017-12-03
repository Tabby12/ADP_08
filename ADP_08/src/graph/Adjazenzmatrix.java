package graph;

public class Adjazenzmatrix extends Graph{

	private int[][] _gewicht;
	
	public Adjazenzmatrix() {
		_gewicht = new int[100][100];
		for(int i= 0; i < 100; i++)
		{
			for(int j = 0; j < 100; j++)
			{
				_gewicht[i][j] = -1;
			}
		}
	}
	
	@Override
	public void allNeigh(Pos pos) {
		int[] arr = _gewicht[pos.getIndex()];
		for(int i = 0; i< arr.length; i++)
		{
			if(arr[i] != -1)
			{
				System.out.println(_arr[i]);
			}
		}
		
	}

	@Override
	public void setNeigh(Pos pos1, Pos pos2, int gewicht, boolean gerichtet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Pos getPos(int index) {
		// TODO Auto-generated method stub
		return null;
	}

}
