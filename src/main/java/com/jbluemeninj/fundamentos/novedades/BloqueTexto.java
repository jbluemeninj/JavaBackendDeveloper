package com.jbluemeninj.fundamentos.novedades;

public class BloqueTexto {
    public static void main(String[] args) {

        String sql =  """
                select * from clientes
                where nombre = 'Juan'
                """;
        System.out.println(sql);

        String html = """
                <html>
                    <body>
                        <h1>Titulo</h1>
                    </body>
                </html>
                """;
        System.out.println(html);
    }
}
