class Solution
{
    public int vowelConsonantScore(String s)
    {
        int v = 0;
        int c = 0;
        char x;

        for(int i=0, l=s.length(); i<l; i++)
        {
            x = s.charAt(i);

            if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u')
                v++;
            
            else if(x>='a' && x<='z')
                c++;
        }

        return c==0 ? 0 : v/c;
    }
}