package newsapi;
@Service
public class NewsService {

    @Value("${news.api.url}")
    private String apiUrl;

    @Autowired
    private RestTemplate restTemplate;

    public List<NewsArticle> getNewsArticles() {
        ResponseEntity<NewsApiResponse> response = restTemplate.exchange(
                apiUrl,
                HttpMethod.GET,
                null,
                NewsApiResponse.class
        );
        
        if (response.getStatusCode() == HttpStatus.OK) {
            return response.getBody().getArticles();
        } else {
            // Handle error response
            return Collections.emptyList();
        }
    }
}