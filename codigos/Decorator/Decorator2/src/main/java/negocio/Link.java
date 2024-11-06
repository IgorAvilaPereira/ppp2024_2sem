/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Link extends MarkdownTagDecorator {
    
    public Link(Markdown markdown, String title, String url) {
        super(markdown);
        this.code = "["+title+"]("+url+")\n";
    }

 
    
}
