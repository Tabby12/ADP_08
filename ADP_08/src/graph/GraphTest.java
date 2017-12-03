package graph;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GraphTest {

	@Test
	void test() {
		Graph graph = new Adjazenzmatrix();
		graph.allNeigh(new Pos());
	}

}
