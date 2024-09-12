import React from "react";
import Comment from "./Comment";

const comments =[
    {
        name:"JJS",
        comment :"즐거운 추석",
    },
    {
        name:"JES",
        comment :"Shifty",
    },
    {
        name:"Roe",
        comment:"안녕",
    },
]
function CommentList(props){
    return(
        <div>
            {/*<Comment name={"JJS"} comment ={"안녕하세여 shifty입니다."}/>*/}
            {/*<Comment name={"JIS"} comment ={"저는 Roe입니다."}/>*/}
            {/*<Comment name={"ONE"} comment ={"Who are you"}/>*/}
            {
                comments.map((comment) => {
                    return(
                        <Comment name={comment.name} comment={comment.comment}/>
                    );
            })
            }
        </div>
    );
}

export default CommentList;