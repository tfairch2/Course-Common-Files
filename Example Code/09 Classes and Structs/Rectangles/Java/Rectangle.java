public class Rectangle
{
    private int width, height;
    
    public void Setup( int newWidth, int newHeight )
    {
        width = newWidth;
        height = newHeight;
    }
    
    public int GetArea()
    {
        return width * height;
    }
    
    public int GetPerimeter()
    {
        return 2 * width + 2 * height;
    }
    
    public boolean IsSquare()
    {
        return ( width == height );
    }
    
    public int GetWidth()
    {
        return width;
    }
    
    public int GetHeight()
    {
        return height;
    }
}