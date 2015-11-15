package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * SpiderTest.java
 */

public class SpiderTest
{
    /**
     * This is our test. It creates a spider (which creates spider legs) and crawls the web.
     *
     * @param args
     *            - not used
     */
    public static void main(String[] args)
    {
        Spider spider = new Spider();
        spider.search("http://arstechnica.com/", "computer");

        Spider spider2 = new Spider();
        spider2.search("http://github.com/", "pizza");

        Spider spider3 = new Spider();
        spider3.search("http://github.com/", "code");
    }


/*    QUESTIONS:

      What affects the number of iterations in the while loop in Spider.search(...)?

        The static final int MAX_PAGES_TO_SEARCH (initialized at 10). This prevents the Spider from going on an 'infinate search'.

      Explain in plain English how SpiderLeg.crawl(...) works.



*/


}