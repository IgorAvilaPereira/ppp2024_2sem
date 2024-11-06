/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public abstract class MarkdownTagDecorator extends Markdown {

    protected Markdown markdown;

    public MarkdownTagDecorator(Markdown markdown) {
        this.markdown = markdown;
    }

    public String getCode() {
        return this.markdown.getCode() + "\n " + this.code;

    }


    @Override
    public Markdown removeTag() {
        return markdown;
    }

}
