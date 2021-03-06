public class Book implements Comparable{
    private String topic;
    private Author author;
    private Cover cover;

    public Book(String topic, Author author, Cover cover) {
        this.topic = topic;
        this.author = author;
        this.cover = cover;
    }

    public String getTopic() {
        return topic;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Book book = (Book) obj;
        if (topic.equals(book.topic)
                && author.equals(book.author)
                && cover.equals(book.cover)) {
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        StringBuilder toSringResult = new StringBuilder("Book: ");
        toSringResult.append(" tytuł: ").append(topic);
        toSringResult.append(", okładka: ").append(cover.getPolski());
        return toSringResult.toString();

    }

    public int compareTo(Object o) {
       Book book = (Book) o;
        return this.topic.compareTo(book.topic);
    }




}

