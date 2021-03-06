package graph;

public class DirectedEdge extends Edge{
	
	/**
         * we have declared an array of sommets from where we have set vertex[0] the origin and vertex[1] the direction
         */
	private Vertex[] sommets;
	
	public DirectedEdge( Vertex origin,Vertex end){
		this.sommets = new Vertex[2];
		this.sommets[0]=origin;
		this.sommets[1]=end;
	}
        
        /**
         * return the element of the origin
         */
	public Vertex getOrigin() {
		return this.sommets[0];
		
	}
        public void setOrigin(Vertex o){
            this.sommets[0]=o;
        }
        public Vertex getEnd(){
            return this.sommets[1];
        }
	public void setEnd(Vertex e){
            this.sommets[1]=e;
        }
}