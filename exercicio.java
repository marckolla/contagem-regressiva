public class exercicio {

  public static void main(String[ ] argv) {

    if (! (argv.length > 0) ) {
	System.out.printf("\n Sem argumentos \n\n");

    } else {

	    int ind = Integer.parseInt(argv[0]);

	    for (; ind > 0; ind--) {
		System.out.printf("\n num = %d ", ind);


	    }

    }

  }
}
