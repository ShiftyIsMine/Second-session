import React from 'react';
import Card from './Card';

function ProfileCard(){
    return(
        <div>
            <Card title="JS Roe" backgroundColor="#820701">
                <p>하이욥 shifty입니다.</p>
                <p>리액트로 카드형 템플릿을 작성 중입니다.</p>
            </Card>
            <Card title="JS Shifty" backgroundColor="#550701">
                <p>하이욥 Roe입니다.</p>
                <p>리액트로 카드형 템플릿을 작성 중입니다.</p>
            </Card>
            <Card title="JS Roe" backgroundColor="#650701">
                <p>하이욥 ddd입니다.</p>
                <p>리액트로 카드형 템플릿을 작성 중입니다.</p>
            </Card>
        </div>
    );
}

export default ProfileCard;