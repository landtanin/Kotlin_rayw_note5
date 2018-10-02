/**
 * Data classes requirements
 *
 * The primary constructor needs at least 1 parameter
 * All primary constructor parameters needs either val or var
 * They cannot be abstract, open, sealed or inner
 */

fun main(args: Array<String>) {

    data class Podcast(val title: String = "title default", val description: String, val url: String)

    // use of copy method
    val podcast = Podcast("Android Central", "The premier source for weekly news", "https://feeds.feedburner.com")

    // only change the title, the rest are copied from the 'podcast' instance
    val podcast2 = podcast.copy(title = "Developers Backstage")

    val (title, description, url) = podcast2
    println("title = $title, url = $url")               // title = Developers Backstage, url = https://feeds.feedburner.com

    // use default value
    val podcast3 = Podcast(description = "A podcast for the learner of English", url = "teacherluke.co.uk")
    println(podcast3.toString())

}