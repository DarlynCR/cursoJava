package annotation;

//Creación de un tipo de anotación personalizada
public @interface ClassPreamble {
    String author();
    String date();
    //Valor predeterminado
    int currentRevision() default 1;
    String lastModified() default "N/A";
    String lastModifiedBy() default "N/A";
    // Note use of array
    String[] reviewers();
}
