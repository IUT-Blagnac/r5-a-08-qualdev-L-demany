# language: fr

Fonctionnalité: Est-ce qu'on est vendredi ?

    Plan de Scénario: On n'est pas vendredi
        Etant donné on est <jour>
        Quand on me demande si c'est vendredi
        Alors je devrais répondre <reponse>

    Exemples:
        | jour            | reponse |
        | vendredi        | TGIF    |
        | dimanche        | non     |
        | anything else!  | non     |

        