/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Title extends MarkdownTagDecorator {
    
    public Title(Markdown markdown, String title) {
        super(markdown);
        this.code = "# "+title;
    }

  
    
}
