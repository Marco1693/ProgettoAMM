<%-- 
    Document   : descrizione
    Created on : 30-apr-2017, 17.09.21
    Author     : Marco Brundu
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Nerdbook: il social network che ti tiene in contatto con i tuoi amici</title>
        
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Marco Brundu">
        <meta name="keywords" content="Nerdbook amici descrizione social network">
    
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
    </head>
    <body>
        <div id="barnav">
            <!--header contenente in titolo della pagina-->
            <jsp:include page="header.jsp"/>
            <!-- barra di navigazione-->
            <c:set var="page" value="descrizione" scope="request"/>
            <jsp:include page="barra.jsp"/>
        </div>  
        <div>
            <h2>Barra di Navigazione</h2>
        </div>
        <div id="divBody">
            <nav>
                <ol>
                    <li><a href="#whtnerdbook">Cosa è Nerdbook?</a>
                        <ul>
                        <li><a href="#sclnetwork">  Social Network</a></li>
                        </ul>
                    </li>
                    <li><a href="#cosapossofare">Cosa posso fare?</a>
                        <ul>
                            <li><a href="#post">  Post</a></li>
                            <li><a href="#groups">  Gruppi</a></li>
                        </ul>
                    </li>
                    <li><a href="#prezzo">Prezzo </a>
                        <ul>
                            <li><a href="#free">  Completamente Gratuito</a></li>
                        </ul>
                    </li>
                    <li><a href="#registrazione"> Registrazione al sito</a>
                        <ul>
                            <li><a href="#signup">  Sign up</a></li>
                            <li><a href="#signin">  Sign in</a></li>
                        </ul>
                    </li>
                </ol>
            </nav>
            <div id="divDesc">
                <div id="whtnerdbook">
                    <h2> Cosa è Nerdbook?</h2>
                    <div id="sclnetwork">
                        <ul>
                            <li>
                                <h3>Social network</h3>
                                <p>Una rete sociale (in lingua inglese social network) consiste in un qualsiasi gruppo di individui connessi tra loro da diversi legami sociali. Per gli esseri umani i legami vanno dalla conoscenza casuale, ai rapporti di lavoro, ai vincoli familiari.social network Con l’espressione social network si identifica un servizio informatico on line che permette la realizzazione di reti sociali virtuali. Si tratta di siti internet o tecnologie che consentono agli utenti di condividere contenuti testuali, immagini, video e audio e di interagire tra loro.Generalmente i s. n. prevedono una registrazione mediante la creazione di un profilo personale protetto da password e la possibilità di effettuare ricerche nel database della struttura informatica per localizzare altri utenti e organizzarli in gruppi e liste di contatti. Le informazioni condivise variano da servizio a servizio e possono includere dati personali, sensibili (credo religioso, opinioni politiche, inclinazioni sessuali ecc.) e professionali.Sui s. n. gli utenti non sono solo fruitori, ma anche creatori di contenuti. La rete sociale diventa un ipertesto interattivo tramite cui diffondere pensieri, idee, link e contenuti multimediali.La presenza di dati sensibili ha portato in primo piano il problema della privacy degli iscritti. Facebook, il s. n. con più utenti al mondo, è corso ai ripari estendendo a metà 2010 il sistema di protezione dei contenuti che permette all’internauta di scegliere che cosa far vedere e a chi.I primi s. n. sono nati negli Stati Uniti a metà degli anni Novanta con l’intenzione di formare delle comunità virtuali fornendo servizi di interazione (theGlobe.com) o spazio web gratuito (GeoCities). Nel 2002 è stato lanciato Friendster che inaugurava la tendenza di offrire all’utente un profilo pubblico da compilare, la possibilità di organizzare i contatti in gruppi di ‘amici’ e di interagire attraverso vari strumenti messi a disposizione dal servizio (chat, messaggistica, e-mail). Il sito ha avuto un successo immediato, ma ben presto è stato scalzato da quelli che diventeranno i colossi del settore: Facebook, MySpace e il cinese QQ.com. La seconda metà del decennio è stata segnata anche dall’ascesa di s. n. tematici come aNobii (dedicato al mondo dei libri) e LinkedIn (lavoro) o che adottano strumenti particolari come Twitter (servizio di microblogging) e FriendFeed (aggregatore).Il social networking costituisce oggi una delle forme più evolute di comunicazione on line e, anche se è pressoché impossibile fornire un numero complessivo, gli utenti sono in costante crescita.</p>
                            </li>
                        </ul>
                    </div>
                </div>
                <div id="cosapossofare">
                    <h2>Cosa posso fare?</h2>
                    <div id="post">
                        <ul>
                            <li>
                                <h3>Post</h3>
                                <p>Avrai la possibilità di scrivere dei post visualizzabili da tutti i tuoi amici. Un post è costituito da un testo o da materiali (ad es. Fogli di lavoro, Attività, Libri, Immagini o Video), e serve per comunicare e condividere i materiali all'interno di un Gruppo.</p>
                            </li>
                        </ul>
                    </div>  
                    <div id="groups">
                        <ul>
                            <li>
                                <h3>Creare Gruppi</h3>
                                <p>Tutti gli utenti registrati potranno creare e gestire dei gruppi. In sociologia e psicologia sociale si definisce gruppo un insieme di persone che interagiscono le une con le altre, in modo ordinato, sulla base di aspettative condivise riguardanti il rispettivo comportamento. È un insieme di persone i cui status e i cui ruoli sono interrelati. Gli esseri umani sono portati a cooperare, competere, analizzare, produrre idee, progettare e decidere in gruppo, i gruppi sono una parte vitale della struttura sociale. I gruppi si formano e si trasformano costantemente; non è necessario che siano autodefiniti e spesso sono definiti dall'esterno. Secondo Lewin un gruppo può definirsi: <br>"una totalità dinamica. Ciò significa che un cambiamento di stato di una sua parte o frazione qualsiasi interessa lo stato di tutte le altre. Il grado di interdipendenza delle frazioni del gruppo varia da una massa indefinita a un'unità compatta. Dipende, tra gli altri fattori, dall'ampiezza, dall'organizzazione e della coesione del gruppo".</p>
                            </li>
                        </ul>
                    </div>
                </div>
                <div id="prezzo">
                    <h2>Prezzo</h2>
                    <div id="free">
                        <ul>
                            <li>
                                <h3>Completamente gratuito</h3>
                                <p>La registrazione e l'utilizzo completo del social network, da parte di tutti gli utenti, è assolutamente gratuita. Esempi di contratto a titolo gratuito sono la dazione di ipoteca a favore del creditore, il quale, a fronte della garanzia reale ricevuta, non concede al debitore alcun vantaggio economico, patrimoniale o finanziario, ovvero gliene concede uno sostanzialmente privo di significato economico (ad es.: dilazione nel pagamento assolutamente irrisoria, riduzione sostanzialmente ininfluente del tasso di interesse, la costituzione di un fondo patrimoniale, ecc...). Questi contratti sono visti con sfavore dall'ordinamento, tanto che possono essere attaccati mediante l'azione revocatoria ordinaria o, nel caso di fallimento del disponente, mediante l'azione revocatoria fallimentare.</p>
                            </li>
                        </ul>
                    </div>
                </div>
                <div id="registrazione">
                    <h2>Registrazione al sito</h2>
                    <div id="signup">
                        <ul>
                            <li>
                                <h3>Sign up</h3>
                                <p>Per registrarsi al sito clicca su "Registrazione" e compila il form con i tuoi dati. Il termine signup o sign up[1] (dall'inglese "registrati" o, meglio, "iscriviti"), nell'ambito delle applicazioni informatiche, indica la procedura di creazione di un account su un sito web, portale, forum, newsletter, ecc. In pratica, il signup è la registrazione ovvero l'iscrizione dell'utente all'applicazione (o, in generale, ad un servizio informatico per cui occorra un account). Una volta eseguita la registrazione l'utente eseguirà il primo e i successivi accessi alla piattaforma o al servizio, utilizzando il proprio account, mediante la procedura di login. Durante il signup, spesso l'utente deve "profilarsi" ovvero specificare i dati che saranno associati al proprio profilo. Ad esempio, la registrazione su Facebook è un classico esempio di signup, eseguito il quale poi basterà effettuare semplicemente il login per i successivi accessi.</p>
                            </li>
                        </ul>
                    </div>
                    <div id="signin">
                        <ul>
                            <li>
                                <h3>Sign in</h3>
                                <p>Se sei già registrato, clicca su login in alto e inserisci nome utente e password per accedere. Il login (spesso anche detto procedura di autenticazione) è un termine utilizzato per indicare la procedura di accesso ad un sistema informatico o ad un'applicazione informatica. Il termine proviene dalla contrazione di log in, entrata nel log, il registro cronologico degli eventi tipico di qualsiasi sistema informativo. Altri termini corrispondenti sono: logon, log on, signon, sign on, sign in. In italiano può essere tradotto in "accedi". Costituisce uno dei fondamenti della sicurezza informatica e della riservatezza nelle applicazioni informatiche. Il login si differenzia concettualmente dalla registrazione, o signup, che è la fase preliminare. È inoltre concettualmente opposto al logout.</p>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
