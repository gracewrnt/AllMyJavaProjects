public interface CarOperation 
{
	enum Direction { LEFT, RIGHT , STRAIGHT, BACKWARD }
	void startUp ( );
	void speedUp ( int increment );
	void speedDown ( int decrement );
	void lightOn ( );
	void turn ( Direction direction );
	
	 
}
