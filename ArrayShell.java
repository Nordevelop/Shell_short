public class arrayShell {
  private long[] Array1;
  private int nElementos;
  public ArrayShel(int max)
  {
    Array1 = new long[max];
    nElementos = 0;
  }
  public void incluir(long valor)
  {
    Array1[nElementos] = valor;
    nElementos++;
  }
    public void mostrar()
    {
      System.out.print("Array[]=");
      for (int j=0; j<nElementos;j++)
        System.out.print(Array1[j] +" ");
      System.out.println(" ");
    }
  public void shellSort()         
		{
		int interno, externo;
		long aux;
		int h = 1;
		while(h <= nElementos/3)
		   h = h*3 + 1;               // incrementar h
		while(h>0){
		   for(externo=h; externo<nElementos; externo++){
		      aux = Array1[externo];
		      interno= externo;             
		      while(interno > h-1 && Array1[interno-h] >= aux){
		         Array1[interno] = Array1[interno-h];
		         interno -= h;
		      }
		Array1[interno] = aux;
		}                             // fin for
		h = (h-1) / 3;               //  reducir h
		} // fin while(h>0)
		} // fin metodo shellSort()
}  // fin Clase ArrayShell
