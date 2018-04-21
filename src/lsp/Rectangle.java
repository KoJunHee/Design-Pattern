package lsp;

public class Rectangle {
    protected int m_width;
    protected int m_height;

    public void setWidth(int width) {
        this.m_width = width;
    }

    public void setHeight(int height) {
        this.m_height = height;
    }

    public int getWidth() {
        return m_width;
    }

    public int getHeight() {
        return m_height;
    }

    public int getArea() {
        return this.m_height * this.m_height;
    }
}

