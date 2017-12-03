package graph;

public class Adjazenzlisten extends Graph {

	@Override
	public void allNeigh(Pos pos) {
		Knoten[] knoten = pos.getKnoten().getNeigh();
		for(Knoten k: knoten)
		{
			System.out.println(k.getData());
		}
		
	}

	@Override
	public void setNeigh(Pos pos1, Pos pos2, int gewicht, boolean gerichtet) {
		if(!gerichtet)
		{
			pos2.getKnoten().addKnoten(pos1.getKnoten(), gewicht);
		}
		pos1.getKnoten().addKnoten(pos2.getKnoten(), gewicht);
	}

	@Override
	protected Pos getPos(int index) {
		Pos pos = new Pos();
		pos.setValid(true);
		pos.setKnoten(new Knoten(_arr[index]));
		return pos;
	}

}
