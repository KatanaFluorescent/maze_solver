package tp4;

public interface PreviousInterface {
	
	public VertexInterface Pere(VertexInterface v); //Retourne le p�re de v dans un chemin optimal
	
	public void Rewrite(VertexInterface v1, VertexInterface v2); //Met le p�re de v1 � la valeur v2
}
